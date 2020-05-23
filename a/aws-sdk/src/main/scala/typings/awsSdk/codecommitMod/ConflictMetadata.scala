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
  def apply(
    contentConflict: js.UndefOr[IsContentConflict] = js.undefined,
    fileModeConflict: js.UndefOr[IsFileModeConflict] = js.undefined,
    fileModes: FileModes = null,
    filePath: Path = null,
    fileSizes: FileSizes = null,
    isBinaryFile: IsBinaryFile = null,
    mergeOperations: MergeOperations = null,
    numberOfConflicts: js.UndefOr[NumberOfConflicts] = js.undefined,
    objectTypeConflict: js.UndefOr[IsObjectTypeConflict] = js.undefined,
    objectTypes: ObjectTypes = null
  ): ConflictMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentConflict)) __obj.updateDynamic("contentConflict")(contentConflict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileModeConflict)) __obj.updateDynamic("fileModeConflict")(fileModeConflict.get.asInstanceOf[js.Any])
    if (fileModes != null) __obj.updateDynamic("fileModes")(fileModes.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fileSizes != null) __obj.updateDynamic("fileSizes")(fileSizes.asInstanceOf[js.Any])
    if (isBinaryFile != null) __obj.updateDynamic("isBinaryFile")(isBinaryFile.asInstanceOf[js.Any])
    if (mergeOperations != null) __obj.updateDynamic("mergeOperations")(mergeOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfConflicts)) __obj.updateDynamic("numberOfConflicts")(numberOfConflicts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectTypeConflict)) __obj.updateDynamic("objectTypeConflict")(objectTypeConflict.get.asInstanceOf[js.Any])
    if (objectTypes != null) __obj.updateDynamic("objectTypes")(objectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConflictMetadata]
  }
}

