package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.deletePromisevoidtoPlainO
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod {
  
  @JSImport("contentful-management/dist/typings/entities/upload", "wrapUpload")
  @js.native
  def wrapUpload(http: AxiosInstance, data: UploadProps): deletePromisevoidtoPlainO = js.native
  
  @js.native
  trait Upload
    extends UploadProps
       with DefaultElements[UploadProps] {
    
    /**
      * Deletes this object on the server.
      * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getUpload('<upload_id>'))
      * .then((upload) => upload.delete())
      * .then((upload) => console.log(`upload ${upload.sys.id} updated.`))
      * .catch(console.error)
      */
    def delete(): js.Promise[Unit] = js.native
  }
  object Upload {
    
    @scala.inline
    def apply(delete: () => js.Promise[Unit], sys: MetaSysProps, toPlainObject: () => UploadProps): Upload = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[Upload]
    }
    
    @scala.inline
    implicit class UploadMutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait UploadProps extends StObject {
    
    /**
      * System metadata
      */
    var sys: MetaSysProps = js.native
  }
  object UploadProps {
    
    @scala.inline
    def apply(sys: MetaSysProps): UploadProps = {
      val __obj = js.Dynamic.literal(sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadProps]
    }
    
    @scala.inline
    implicit class UploadPropsMutableBuilder[Self <: UploadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
