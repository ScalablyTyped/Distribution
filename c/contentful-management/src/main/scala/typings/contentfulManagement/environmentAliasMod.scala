package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.OmitEnvironmentAliasProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentAliasMod {
  
  @JSImport("contentful-management/dist/typings/entities/environment-alias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapEnvironmentAlias(http: AxiosInstance, data: EnvironmentAliasProps): EnvironmentAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEnvironmentAlias")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[EnvironmentAlias]
  
  inline def wrapEnvironmentAliasCollection(http: AxiosInstance, data: CollectionProp[EnvironmentAliasProps]): Collection[EnvironmentAlias, EnvironmentAliasProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEnvironmentAliasCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[EnvironmentAlias, EnvironmentAliasProps]]
  
  trait EnvironmentAlias
    extends StObject
       with EnvironmentAliasProps
       with DefaultElements[EnvironmentAliasProps] {
    
    /**
      * Sends an update to the server with any changes made to the object's properties. Currently, you can only change the id of the alias's underlying environment. See the example below.
      * @memberof EnvironmentAlias
      * @func update
      * @return {Promise<EnvironmentAlias>} Object returned from the server with updated changes.
      * ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getEnvironmentAlias('<environment_alias_id>'))
      * .then((alias) => {
      *   alias.environment.sys.id = '<environment_id>'
      *   return alias.update()
      * })
      * .then((alias) => console.log(`alias ${alias.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(data: OmitEnvironmentAliasProps): js.Promise[EnvironmentAlias]
  }
  object EnvironmentAlias {
    
    inline def apply(
      environment: MetaLinkProps,
      sys: MetaSysProps,
      toPlainObject: () => EnvironmentAliasProps,
      update: OmitEnvironmentAliasProps => js.Promise[EnvironmentAlias]
    ): EnvironmentAlias = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[EnvironmentAlias]
    }
    
    extension [Self <: EnvironmentAlias](x: Self) {
      
      inline def setUpdate(value: OmitEnvironmentAliasProps => js.Promise[EnvironmentAlias]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait EnvironmentAliasProps extends StObject {
    
    var environment: MetaLinkProps
    
    /**
      * System meta data
      */
    var sys: MetaSysProps
  }
  object EnvironmentAliasProps {
    
    inline def apply(environment: MetaLinkProps, sys: MetaSysProps): EnvironmentAliasProps = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentAliasProps]
    }
    
    extension [Self <: EnvironmentAliasProps](x: Self) {
      
      inline def setEnvironment(value: MetaLinkProps): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
