package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.itemView
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.navPane
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.fileManagement.FileSystemItem
import typings.std.File
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManager
  extends StObject
     with Widget[dxFileManagerOptions] {
  
  /**
    * Gets the current directory object.
    */
  def getCurrentDirectory(): Any = js.native
  
  /**
    * Gets the selected items.
    */
  def getSelectedItems(): js.Array[Any] = js.native
  
  /**
    * Reloads data and repaints the UI component.
    */
  def refresh(): DxPromise[Any] = js.native
}
object dxFileManager {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait ActionEventInfo extends StObject {
    
    var cancel: Boolean | js.Thenable[Unit]
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var errorText: String
  }
  object ActionEventInfo {
    
    inline def apply(cancel: Boolean | js.Thenable[Unit], errorText: String): ActionEventInfo = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionEventInfo]
    }
    
    extension [Self <: ActionEventInfo](x: Self) {
      
      inline def setCancel(value: Boolean | js.Thenable[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxFileManager]
  
  type ContextMenuItem = dxFileManagerContextMenuItem
  
  trait ContextMenuItemClickEvent
    extends StObject
       with NativeEventInfo[dxFileManager, KeyboardEvent | PointerEvent | MouseEvent] {
    
    val fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
    
    val itemData: Any
    
    val itemElement: DxElement_[HTMLElement]
    
    val itemIndex: Double
    
    val viewArea: navPane | itemView
  }
  object ContextMenuItemClickEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemData: Any,
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double,
      viewArea: navPane | itemView
    ): ContextMenuItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], viewArea = viewArea.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuItemClickEvent]
    }
    
    extension [Self <: ContextMenuItemClickEvent](x: Self) {
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setViewArea(value: navPane | itemView): Self = StObject.set(x, "viewArea", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextMenuShowingEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxFileManager, KeyboardEvent | PointerEvent | MouseEvent] {
    
    val fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
    
    val targetElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val viewArea: navPane | itemView
  }
  object ContextMenuShowingEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], viewArea: navPane | itemView): ContextMenuShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], viewArea = viewArea.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuShowingEvent]
    }
    
    extension [Self <: ContextMenuShowingEvent](x: Self) {
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
      
      inline def setTargetElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      inline def setViewArea(value: navPane | itemView): Self = StObject.set(x, "viewArea", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentDirectoryChangedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val directory: FileSystemItem
  }
  object CurrentDirectoryChangedEvent {
    
    inline def apply(component: dxFileManager, directory: FileSystemItem, element: DxElement_[HTMLElement]): CurrentDirectoryChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentDirectoryChangedEvent]
    }
    
    extension [Self <: CurrentDirectoryChangedEvent](x: Self) {
      
      inline def setDirectory(value: FileSystemItem): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryCreatedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val name: String
    
    val parentDirectory: FileSystemItem
  }
  object DirectoryCreatedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      name: String,
      parentDirectory: FileSystemItem
    ): DirectoryCreatedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryCreatedEvent]
    }
    
    extension [Self <: DirectoryCreatedEvent](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryCreatingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val name: String
    
    val parentDirectory: FileSystemItem
  }
  object DirectoryCreatingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      name: String,
      parentDirectory: FileSystemItem
    ): DirectoryCreatingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryCreatingEvent]
    }
    
    extension [Self <: DirectoryCreatingEvent](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxFileManager]
  
  trait ErrorOccurredEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val errorCode: js.UndefOr[Double] = js.undefined
    
    var errorText: js.UndefOr[String] = js.undefined
    
    val fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
  }
  object ErrorOccurredEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement]): ErrorOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorOccurredEvent]
    }
    
    extension [Self <: ErrorOccurredEvent](x: Self) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    }
  }
  
  trait FileUploadedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val fileData: File
    
    val parentDirectory: FileSystemItem
  }
  object FileUploadedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      fileData: File,
      parentDirectory: FileSystemItem
    ): FileUploadedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileData = fileData.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadedEvent]
    }
    
    extension [Self <: FileUploadedEvent](x: Self) {
      
      inline def setFileData(value: File): Self = StObject.set(x, "fileData", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val destinationDirectory: FileSystemItem
    
    val fileData: File
  }
  object FileUploadingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      destinationDirectory: FileSystemItem,
      element: DxElement_[HTMLElement],
      errorText: String,
      fileData: File
    ): FileUploadingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], destinationDirectory = destinationDirectory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], fileData = fileData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadingEvent]
    }
    
    extension [Self <: FileUploadingEvent](x: Self) {
      
      inline def setDestinationDirectory(value: FileSystemItem): Self = StObject.set(x, "destinationDirectory", value.asInstanceOf[js.Any])
      
      inline def setFileData(value: File): Self = StObject.set(x, "fileData", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedItemChangedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val item: js.UndefOr[FileSystemItem] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object FocusedItemChangedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement]): FocusedItemChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedItemChangedEvent]
    }
    
    extension [Self <: FocusedItemChangedEvent](x: Self) {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxFileManager]
  
  trait ItemCopiedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val itemName: String
    
    val itemPath: String
    
    val parentDirectory: FileSystemItem
    
    val sourceItem: FileSystemItem
  }
  object ItemCopiedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemName: String,
      itemPath: String,
      parentDirectory: FileSystemItem,
      sourceItem: FileSystemItem
    ): ItemCopiedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any], sourceItem = sourceItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCopiedEvent]
    }
    
    extension [Self <: ItemCopiedEvent](x: Self) {
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
      
      inline def setSourceItem(value: FileSystemItem): Self = StObject.set(x, "sourceItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemCopyingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val destinationDirectory: FileSystemItem
    
    val item: FileSystemItem
  }
  object ItemCopyingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      destinationDirectory: FileSystemItem,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemCopyingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], destinationDirectory = destinationDirectory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCopyingEvent]
    }
    
    extension [Self <: ItemCopyingEvent](x: Self) {
      
      inline def setDestinationDirectory(value: FileSystemItem): Self = StObject.set(x, "destinationDirectory", value.asInstanceOf[js.Any])
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDeletedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val item: FileSystemItem
  }
  object ItemDeletedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], item: FileSystemItem): ItemDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeletedEvent]
    }
    
    extension [Self <: ItemDeletedEvent](x: Self) {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDeletingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val item: FileSystemItem
  }
  object ItemDeletingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemDeletingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeletingEvent]
    }
    
    extension [Self <: ItemDeletingEvent](x: Self) {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDownloadingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val item: FileSystemItem
  }
  object ItemDownloadingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemDownloadingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDownloadingEvent]
    }
    
    extension [Self <: ItemDownloadingEvent](x: Self) {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemMovedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val itemName: String
    
    val itemPath: String
    
    val parentDirectory: FileSystemItem
    
    val sourceItem: FileSystemItem
  }
  object ItemMovedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemName: String,
      itemPath: String,
      parentDirectory: FileSystemItem,
      sourceItem: FileSystemItem
    ): ItemMovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any], sourceItem = sourceItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemMovedEvent]
    }
    
    extension [Self <: ItemMovedEvent](x: Self) {
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
      
      inline def setSourceItem(value: FileSystemItem): Self = StObject.set(x, "sourceItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemMovingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val destinationDirectory: FileSystemItem
    
    val item: FileSystemItem
  }
  object ItemMovingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      destinationDirectory: FileSystemItem,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemMovingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], destinationDirectory = destinationDirectory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemMovingEvent]
    }
    
    extension [Self <: ItemMovingEvent](x: Self) {
      
      inline def setDestinationDirectory(value: FileSystemItem): Self = StObject.set(x, "destinationDirectory", value.asInstanceOf[js.Any])
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemRenamedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val itemName: String
    
    val sourceItem: FileSystemItem
  }
  object ItemRenamedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemName: String,
      sourceItem: FileSystemItem
    ): ItemRenamedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], sourceItem = sourceItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenamedEvent]
    }
    
    extension [Self <: ItemRenamedEvent](x: Self) {
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setSourceItem(value: FileSystemItem): Self = StObject.set(x, "sourceItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemRenamingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val item: FileSystemItem
    
    val newName: String
  }
  object ItemRenamingEvent {
    
    inline def apply(
      cancel: Boolean | js.Thenable[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem,
      newName: String
    ): ItemRenamingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenamingEvent]
    }
    
    extension [Self <: ItemRenamingEvent](x: Self) {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFileManagerOptions
  
  trait SelectedFileOpenedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val file: FileSystemItem
  }
  object SelectedFileOpenedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], file: FileSystemItem): SelectedFileOpenedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedFileOpenedEvent]
    }
    
    extension [Self <: SelectedFileOpenedEvent](x: Self) {
      
      inline def setFile(value: FileSystemItem): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val currentDeselectedItemKeys: js.Array[String]
    
    val currentSelectedItemKeys: js.Array[String]
    
    val selectedItemKeys: js.Array[String]
    
    val selectedItems: js.Array[FileSystemItem]
  }
  object SelectionChangedEvent {
    
    inline def apply(
      component: dxFileManager,
      currentDeselectedItemKeys: js.Array[String],
      currentSelectedItemKeys: js.Array[String],
      element: DxElement_[HTMLElement],
      selectedItemKeys: js.Array[String],
      selectedItems: js.Array[FileSystemItem]
    ): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], currentDeselectedItemKeys = currentDeselectedItemKeys.asInstanceOf[js.Any], currentSelectedItemKeys = currentSelectedItemKeys.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedItemKeys = selectedItemKeys.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setCurrentDeselectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "currentDeselectedItemKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentDeselectedItemKeysVarargs(value: String*): Self = StObject.set(x, "currentDeselectedItemKeys", js.Array(value*))
      
      inline def setCurrentSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "currentSelectedItemKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "currentSelectedItemKeys", js.Array(value*))
      
      inline def setSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
      
      inline def setSelectedItems(value: js.Array[FileSystemItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: FileSystemItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
  
  type ToolbarItem = dxFileManagerToolbarItem
  
  trait ToolbarItemClickEvent
    extends StObject
       with NativeEventInfo[dxFileManager, PointerEvent | MouseEvent] {
    
    val itemData: Any
    
    val itemElement: DxElement_[HTMLElement]
    
    val itemIndex: Double
  }
  object ToolbarItemClickEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemData: Any,
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ToolbarItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarItemClickEvent]
    }
    
    extension [Self <: ToolbarItemClickEvent](x: Self) {
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    }
  }
}
