package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRequires extends StObject {
  
  /**
    * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
    */
  var Name: DocumentARN
  
  /**
    * The document type of the required SSM document.
    */
  var RequireType: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.RequireType] = js.undefined
  
  /**
    * The document version required by the current document.
    */
  var Version: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object DocumentRequires {
  
  inline def apply(Name: DocumentARN): DocumentRequires = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRequires]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentRequires] (val x: Self) extends AnyVal {
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequireType(value: RequireType): Self = StObject.set(x, "RequireType", value.asInstanceOf[js.Any])
    
    inline def setRequireTypeUndefined: Self = StObject.set(x, "RequireType", js.undefined)
    
    inline def setVersion(value: DocumentVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
