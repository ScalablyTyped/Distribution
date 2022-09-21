package typings.chrome.anon

import typings.chrome.chrome.tabGroups.MoveProperties
import typings.chrome.chrome.tabGroups.QueryInfo
import typings.chrome.chrome.tabGroups.TabGroup
import typings.chrome.chrome.tabGroups.TabGroupCreatedEvent
import typings.chrome.chrome.tabGroups.TabGroupMovedEvent
import typings.chrome.chrome.tabGroups.TabGroupRemovedEvent
import typings.chrome.chrome.tabGroups.TabGroupUpdated
import typings.chrome.chrome.tabGroups.UpdateProperties
import typings.chrome.chromeNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftabGroups extends StObject {
  
  var TAB_GROUP_ID_NONE: `-1` = js.native
  
  def get(groupId: Double): js.Promise[TabGroup] = js.native
  def get(groupId: Double, callback: js.Function1[/* group */ TabGroup, Unit]): Unit = js.native
  
  def move(groupId: Double, moveProperties: MoveProperties): Unit = js.native
  def move(
    groupId: Double,
    moveProperties: MoveProperties,
    callback: js.Function1[/* group */ TabGroup, Unit]
  ): Unit = js.native
  @JSName("move")
  def move_Promise(groupId: Double, moveProperties: MoveProperties): js.Promise[TabGroup] = js.native
  
  var onCreated: TabGroupCreatedEvent = js.native
  
  var onMoved: TabGroupMovedEvent = js.native
  
  var onRemoved: TabGroupRemovedEvent = js.native
  
  var onUpdated: TabGroupUpdated = js.native
  
  def query(queryInfo: QueryInfo): js.Promise[js.Array[TabGroup]] = js.native
  def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[TabGroup], Unit]): Unit = js.native
  
  def update(groupId: Double, updateProperties: UpdateProperties): Unit = js.native
  def update(
    groupId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* group */ TabGroup, Unit]
  ): Unit = js.native
  @JSName("update")
  def update_Promise(groupId: Double, updateProperties: UpdateProperties): js.Promise[TabGroup] = js.native
}
