package typings.chrome.global.chrome

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

////////////////////
// Tab Groups
////////////////////
/**
  * Use the chrome.tabGroups API to interact with the browser's tab grouping system. You can use this API to modify and rearrange tab groups in the browser. To group and ungroup tabs, or to query what tabs are in groups, use the chrome.tabs API.
  * Permissions:  "tabGroups"
  * @since Chrome 89. Manifest V3 and above.
  */
object tabGroups {
  
  @JSGlobal("chrome.tabGroups")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.tabGroups.TAB_GROUP_ID_NONE")
  @js.native
  def TAB_GROUP_ID_NONE: `-1` = js.native
  inline def TAB_GROUP_ID_NONE_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_GROUP_ID_NONE")(x.asInstanceOf[js.Any])
  
  inline def get(groupId: Double): js.Promise[TabGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(groupId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TabGroup]]
  inline def get(groupId: Double, callback: js.Function1[/* group */ TabGroup, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(groupId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def move(groupId: Double, moveProperties: MoveProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(groupId.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def move(
    groupId: Double,
    moveProperties: MoveProperties,
    callback: js.Function1[/* group */ TabGroup, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(groupId.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def move_Promise(groupId: Double, moveProperties: MoveProperties): js.Promise[TabGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(groupId.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TabGroup]]
  
  @JSGlobal("chrome.tabGroups.onCreated")
  @js.native
  def onCreated: TabGroupCreatedEvent = js.native
  inline def onCreated_=(x: TabGroupCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabGroups.onMoved")
  @js.native
  def onMoved: TabGroupMovedEvent = js.native
  inline def onMoved_=(x: TabGroupMovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabGroups.onRemoved")
  @js.native
  def onRemoved: TabGroupRemovedEvent = js.native
  inline def onRemoved_=(x: TabGroupRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabGroups.onUpdated")
  @js.native
  def onUpdated: TabGroupUpdated = js.native
  inline def onUpdated_=(x: TabGroupUpdated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(x.asInstanceOf[js.Any])
  
  inline def query(queryInfo: QueryInfo): js.Promise[js.Array[TabGroup]] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TabGroup]]]
  inline def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[TabGroup], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(groupId: Double, updateProperties: UpdateProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(groupId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(
    groupId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* group */ TabGroup, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(groupId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update_Promise(groupId: Double, updateProperties: UpdateProperties): js.Promise[TabGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(groupId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TabGroup]]
}
