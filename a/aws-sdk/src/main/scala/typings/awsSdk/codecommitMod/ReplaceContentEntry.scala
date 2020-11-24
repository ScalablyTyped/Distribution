package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceContentEntry extends js.Object {
  
  /**
    * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
    */
  var content: js.UndefOr[FileContent] = js.native
  
  /**
    * The file mode to apply during conflict resoltion.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  
  /**
    * The path of the conflicting file.
    */
  var filePath: Path = js.native
  
  /**
    * The replacement type to use when determining how to resolve the conflict.
    */
  var replacementType: ReplacementTypeEnum = js.native
}
object ReplaceContentEntry {
  
  @scala.inline
  def apply(filePath: Path, replacementType: ReplacementTypeEnum): ReplaceContentEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], replacementType = replacementType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContentEntry]
  }
  
  @scala.inline
  implicit class ReplaceContentEntryOps[Self <: ReplaceContentEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementType(value: ReplacementTypeEnum): Self = this.set("replacementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: FileContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = this.set("fileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileMode: Self = this.set("fileMode", js.undefined)
  }
}
