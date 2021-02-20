package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRequires extends StObject {
  
  /**
    * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
    */
  var Name: DocumentARN = js.native
  
  /**
    * The document version required by the current document.
    */
  var Version: js.UndefOr[DocumentVersion] = js.native
}
object DocumentRequires {
  
  @scala.inline
  def apply(Name: DocumentARN): DocumentRequires = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRequires]
  }
  
  @scala.inline
  implicit class DocumentRequiresMutableBuilder[Self <: DocumentRequires] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: DocumentVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
