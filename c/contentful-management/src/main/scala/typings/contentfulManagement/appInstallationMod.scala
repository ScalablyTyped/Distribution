package typings.contentfulManagement

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropsappDefinition
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appInstallationMod {
  
  @JSImport("contentful-management/dist/typings/entities/app-installation", "wrapAppInstallation")
  @js.native
  def wrapAppInstallation(http: AxiosInstance, data: AppInstallationProps): AppInstallation = js.native
  
  @JSImport("contentful-management/dist/typings/entities/app-installation", "wrapAppInstallationCollection")
  @js.native
  def wrapAppInstallationCollection(http: AxiosInstance, data: CollectionProp[AppInstallationProps]): Collection[AppInstallation, AppInstallationProps] = js.native
  
  @js.native
  trait AppInstallation
    extends AppInstallationProps
       with DefaultElements[AppInstallationProps] {
    
    /**
      * Deletes this object on the server.
      * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getEnvironment('<environment_id>'))
      * .then((environment) => environment.getAppInstallation('<app_definition_id>'))
      * .then((appInstallation) => appInstallation.delete())
      * .then(() => console.log(`App installation deleted.`))
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Sends an update to the server with any changes made to the object's properties
      * @return Object returned from the server with updated changes.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getEnvironment('<environment_id>'))
      * .then((environment) => environment.getAppInstallation('<app_definition_id>'))
      * .then((appInstallation) => {
      *    appInstallation.parameters.someParameter = 'New Value'
      *    return appInstallation.update()
      * })
      * .then((appInstallation) => console.log(`App installation ${appInstallation.sys.id} was updated`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[AppInstallation] = js.native
  }
  object AppInstallation {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      parameters: StringDictionary[String],
      sys: MetaSysPropsappDefinition,
      toPlainObject: () => AppInstallationProps,
      update: () => js.Promise[AppInstallation]
    ): AppInstallation = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), parameters = parameters.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[AppInstallation]
    }
    
    @scala.inline
    implicit class AppInstallationMutableBuilder[Self <: AppInstallation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[AppInstallation]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AppInstallationProps extends StObject {
    
    /** App Installation specific configuration variables */
    var parameters: StringDictionary[String] = js.native
    
    var sys: MetaSysPropsappDefinition = js.native
  }
  object AppInstallationProps {
    
    @scala.inline
    def apply(parameters: StringDictionary[String], sys: MetaSysPropsappDefinition): AppInstallationProps = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInstallationProps]
    }
    
    @scala.inline
    implicit class AppInstallationPropsMutableBuilder[Self <: AppInstallationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysPropsappDefinition): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
