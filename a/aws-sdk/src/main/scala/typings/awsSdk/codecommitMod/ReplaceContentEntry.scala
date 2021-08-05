package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceContentEntry extends StObject {
  
  /**
    * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
    */
  var content: js.UndefOr[FileContent] = js.undefined
  
  /**
    * The file mode to apply during conflict resoltion.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  
  /**
    * The path of the conflicting file.
    */
  var filePath: Path
  
  /**
    * The replacement type to use when determining how to resolve the conflict.
    */
  var replacementType: ReplacementTypeEnum
}
object ReplaceContentEntry {
  
  inline def apply(filePath: Path, replacementType: ReplacementTypeEnum): ReplaceContentEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], replacementType = replacementType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContentEntry]
  }
  
  extension [Self <: ReplaceContentEntry](x: Self) {
    
    inline def setContent(value: FileContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    inline def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setReplacementType(value: ReplacementTypeEnum): Self = StObject.set(x, "replacementType", value.asInstanceOf[js.Any])
  }
}
