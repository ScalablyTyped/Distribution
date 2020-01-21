package typings.chromeApps.chrome.fileSystem

import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.chooseEntry")
@js.native
object chooseEntry extends js.Object {
  /** Ask the user to choose a file or directory. */
  def apply(
    callback: FileEntryCallback[ChooseFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  def apply(
    options: ChooseDirectoryEntryOptions,
    callback: FileEntryCallback[ChooseDirectoryEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  /** Ask the user to choose a file or directory. */
  def apply(
    options: ChooseEntryOptionsBase,
    callback: FileEntryCallback[ChooseEntryOptionsBase, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  def apply(
    options: ChooseFileEntryOptions,
    callback: FileEntryCallback[ChooseFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  def apply(
    options: ChooseMultipleFilesEntryOptions,
    callback: FileEntryCallback[ChooseMultipleFilesEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
  def apply(
    options: ChooseSaveFileEntryOptions,
    callback: FileEntryCallback[ChooseSaveFileEntryOptions, FileEntry | DirectoryEntry | js.Array[FileEntry]]
  ): Unit = js.native
}

