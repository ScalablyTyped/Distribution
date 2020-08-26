package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConflictMetadata extends js.Object {
  /**
    * A boolean value indicating whether there are conflicts in the content of a file.
    */
  var contentConflict: js.UndefOr[IsContentConflict] = js.native
  /**
    * A boolean value indicating whether there are conflicts in the file mode of a file.
    */
  var fileModeConflict: js.UndefOr[IsFileModeConflict] = js.native
  /**
    * The file modes of the file in the source, destination, and base of the merge.
    */
  var fileModes: js.UndefOr[FileModes] = js.native
  /**
    * The path of the file that contains conflicts.
    */
  var filePath: js.UndefOr[Path] = js.native
  /**
    * The file sizes of the file in the source, destination, and base of the merge.
    */
  var fileSizes: js.UndefOr[FileSizes] = js.native
  /**
    * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and base of the merge.
    */
  var isBinaryFile: js.UndefOr[IsBinaryFile] = js.native
  /**
    * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
    */
  var mergeOperations: js.UndefOr[MergeOperations] = js.native
  /**
    * The number of conflicts, including both hunk conflicts and metadata conflicts.
    */
  var numberOfConflicts: js.UndefOr[NumberOfConflicts] = js.native
  /**
    * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of a file, folder, or submodule.
    */
  var objectTypeConflict: js.UndefOr[IsObjectTypeConflict] = js.native
  /**
    * Information about any object type conflicts in a merge operation.
    */
  var objectTypes: js.UndefOr[ObjectTypes] = js.native
}

object ConflictMetadata {
  @scala.inline
  def apply(): ConflictMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictMetadata]
  }
  @scala.inline
  implicit class ConflictMetadataOps[Self <: ConflictMetadata] (val x: Self) extends AnyVal {
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
    def setContentConflict(value: IsContentConflict): Self = this.set("contentConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentConflict: Self = this.set("contentConflict", js.undefined)
    @scala.inline
    def setFileModeConflict(value: IsFileModeConflict): Self = this.set("fileModeConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileModeConflict: Self = this.set("fileModeConflict", js.undefined)
    @scala.inline
    def setFileModes(value: FileModes): Self = this.set("fileModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileModes: Self = this.set("fileModes", js.undefined)
    @scala.inline
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFileSizes(value: FileSizes): Self = this.set("fileSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSizes: Self = this.set("fileSizes", js.undefined)
    @scala.inline
    def setIsBinaryFile(value: IsBinaryFile): Self = this.set("isBinaryFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBinaryFile: Self = this.set("isBinaryFile", js.undefined)
    @scala.inline
    def setMergeOperations(value: MergeOperations): Self = this.set("mergeOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeOperations: Self = this.set("mergeOperations", js.undefined)
    @scala.inline
    def setNumberOfConflicts(value: NumberOfConflicts): Self = this.set("numberOfConflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfConflicts: Self = this.set("numberOfConflicts", js.undefined)
    @scala.inline
    def setObjectTypeConflict(value: IsObjectTypeConflict): Self = this.set("objectTypeConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeConflict: Self = this.set("objectTypeConflict", js.undefined)
    @scala.inline
    def setObjectTypes(value: ObjectTypes): Self = this.set("objectTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypes: Self = this.set("objectTypes", js.undefined)
  }
  
}

