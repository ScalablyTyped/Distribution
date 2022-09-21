package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.All
import typings.cloudinaryUploadwidgetBrowser.anon.File
import typings.cloudinaryUploadwidgetBrowser.anon.Id
import typings.cloudinaryUploadwidgetBrowser.anon.Items
import typings.cloudinaryUploadwidgetBrowser.anon.Reason
import typings.cloudinaryUploadwidgetBrowser.anon.Tags
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.expanded
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.hidden
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.minimized
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cloudinaryUploadwidgetBrowser.AbortEvent
  - typings.cloudinaryUploadwidgetBrowser.BatchCancelledEvent
  - typings.cloudinaryUploadwidgetBrowser.CloseEvent
  - typings.cloudinaryUploadwidgetBrowser.DisplayChangedEvent
  - typings.cloudinaryUploadwidgetBrowser.PublicIdEvent
  - typings.cloudinaryUploadwidgetBrowser.QueuesEndEvent
  - typings.cloudinaryUploadwidgetBrowser.QueuesStartEvent
  - typings.cloudinaryUploadwidgetBrowser.RetryEvent
  - typings.cloudinaryUploadwidgetBrowser.ShowCompletedEvent
  - typings.cloudinaryUploadwidgetBrowser.SourceChangedEvent
  - typings.cloudinaryUploadwidgetBrowser.SuccessEvent
  - typings.cloudinaryUploadwidgetBrowser.TagsEvent
  - typings.cloudinaryUploadwidgetBrowser.UploadAddedEvent
*/
trait CloudinaryEvent extends StObject
object CloudinaryEvent {
  
  inline def AbortEvent(info: All): typings.cloudinaryUploadwidgetBrowser.AbortEvent = {
    val __obj = js.Dynamic.literal(event = "abort", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.AbortEvent]
  }
  
  inline def BatchCancelledEvent(info: Reason): typings.cloudinaryUploadwidgetBrowser.BatchCancelledEvent = {
    val __obj = js.Dynamic.literal(event = "batch-cancelled", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.BatchCancelledEvent]
  }
  
  inline def CloseEvent(): typings.cloudinaryUploadwidgetBrowser.CloseEvent = {
    val __obj = js.Dynamic.literal(event = "close")
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.CloseEvent]
  }
  
  inline def DisplayChangedEvent(info: shown | hidden | minimized | expanded): typings.cloudinaryUploadwidgetBrowser.DisplayChangedEvent = {
    val __obj = js.Dynamic.literal(event = "display-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.DisplayChangedEvent]
  }
  
  inline def PublicIdEvent(info: Id): typings.cloudinaryUploadwidgetBrowser.PublicIdEvent = {
    val __obj = js.Dynamic.literal(event = "publicid", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.PublicIdEvent]
  }
  
  inline def QueuesEndEvent(info: Any): typings.cloudinaryUploadwidgetBrowser.QueuesEndEvent = {
    val __obj = js.Dynamic.literal(event = "queues-end", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.QueuesEndEvent]
  }
  
  inline def QueuesStartEvent(): typings.cloudinaryUploadwidgetBrowser.QueuesStartEvent = {
    val __obj = js.Dynamic.literal(event = "queues-start")
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.QueuesStartEvent]
  }
  
  inline def RetryEvent(info: All): typings.cloudinaryUploadwidgetBrowser.RetryEvent = {
    val __obj = js.Dynamic.literal(event = "retry", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.RetryEvent]
  }
  
  inline def ShowCompletedEvent(info: Items): typings.cloudinaryUploadwidgetBrowser.ShowCompletedEvent = {
    val __obj = js.Dynamic.literal(event = "show-completed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.ShowCompletedEvent]
  }
  
  inline def SourceChangedEvent(info: typings.cloudinaryUploadwidgetBrowser.anon.Source): typings.cloudinaryUploadwidgetBrowser.SourceChangedEvent = {
    val __obj = js.Dynamic.literal(event = "source-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.SourceChangedEvent]
  }
  
  inline def SuccessEvent(info: Any): typings.cloudinaryUploadwidgetBrowser.SuccessEvent = {
    val __obj = js.Dynamic.literal(event = "success", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.SuccessEvent]
  }
  
  inline def TagsEvent(info: Tags): typings.cloudinaryUploadwidgetBrowser.TagsEvent = {
    val __obj = js.Dynamic.literal(event = "tags", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.TagsEvent]
  }
  
  inline def UploadAddedEvent(info: File): typings.cloudinaryUploadwidgetBrowser.UploadAddedEvent = {
    val __obj = js.Dynamic.literal(event = "upload-added", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cloudinaryUploadwidgetBrowser.UploadAddedEvent]
  }
}
