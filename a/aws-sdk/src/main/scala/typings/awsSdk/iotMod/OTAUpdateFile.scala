package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OTAUpdateFile extends StObject {
  
  /**
    * A list of name/attribute pairs.
    */
  var attributes: js.UndefOr[AttributesMap] = js.native
  
  /**
    * The code signing method of the file.
    */
  var codeSigning: js.UndefOr[CodeSigning] = js.native
  
  /**
    * The location of the updated firmware.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.native
  
  /**
    * The name of the file.
    */
  var fileName: js.UndefOr[FileName] = js.native
  
  /**
    * The file version.
    */
  var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.native
}
object OTAUpdateFile {
  
  @scala.inline
  def apply(): OTAUpdateFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateFile]
  }
  
  @scala.inline
  implicit class OTAUpdateFileMutableBuilder[Self <: OTAUpdateFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setCodeSigning(value: CodeSigning): Self = StObject.set(x, "codeSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSigningUndefined: Self = StObject.set(x, "codeSigning", js.undefined)
    
    @scala.inline
    def setFileLocation(value: FileLocation): Self = StObject.set(x, "fileLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLocationUndefined: Self = StObject.set(x, "fileLocation", js.undefined)
    
    @scala.inline
    def setFileName(value: FileName): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFileVersion(value: OTAUpdateFileVersion): Self = StObject.set(x, "fileVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileVersionUndefined: Self = StObject.set(x, "fileVersion", js.undefined)
  }
}
