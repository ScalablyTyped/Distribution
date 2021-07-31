package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/asset.AssetFileProp, 'sys'> */
trait OmitAssetFilePropsys extends StObject {
  
  var fields: Title
}
object OmitAssetFilePropsys {
  
  @scala.inline
  def apply(fields: Title): OmitAssetFilePropsys = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAssetFilePropsys]
  }
  
  @scala.inline
  implicit class OmitAssetFilePropsysMutableBuilder[Self <: OmitAssetFilePropsys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: Title): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
