package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeInt extends js.Object {
  var URI: java.lang.String = js.native
  var defaultQoS: MessagingQOS = js.native
  var logging: scala.Boolean = js.native
  var masterSecret: java.lang.String = js.native
  var messagingPort: scala.Double = js.native
  var messagingURI: java.lang.String = js.native
  var systemKey: java.lang.String = js.native
  var systemSecret: java.lang.String = js.native
  def Analytics(): clearbladejsDashClientLib.CbClientNs.Analytics = js.native
  def Code(): clearbladejsDashClientLib.CbClientNs.Code = js.native
  def Collection(options: CollectionOptionsWithID): clearbladejsDashClientLib.CbClientNs.Collection = js.native
  def Collection(options: CollectionOptionsWithName): clearbladejsDashClientLib.CbClientNs.Collection = js.native
  def Collection(options: java.lang.String): clearbladejsDashClientLib.CbClientNs.Collection = js.native
  def Device(): clearbladejsDashClientLib.CbClientNs.Device = js.native
  def Edge(): clearbladejsDashClientLib.CbClientNs.Edge = js.native
  def Item(data: js.Object, collectionID: ItemOptions): clearbladejsDashClientLib.CbClientNs.Item = js.native
  def Item(data: js.Object, collectionID: java.lang.String): clearbladejsDashClientLib.CbClientNs.Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): clearbladejsDashClientLib.CbClientNs.Messaging = js.native
  def MessagingStats(): clearbladejsDashClientLib.CbClientNs.MessagingStats = js.native
  def Metrics(): clearbladejsDashClientLib.CbClientNs.Metrics = js.native
  def Portal(name: java.lang.String): clearbladejsDashClientLib.CbClientNs.Portal = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def Query(options: java.lang.String): QueryObj = js.native
  def Triggers(): clearbladejsDashClientLib.CbClientNs.Triggers = js.native
  def User(): AppUser = js.native
  def getAllCollections(callback: CbCallback): scala.Unit = js.native
  def getEdges(query: Query, callback: CbCallback): scala.Unit = js.native
  def init(options: InitOptions): scala.Unit = js.native
  def isCurrentUserAuthenticated(callback: CbCallback): scala.Unit = js.native
  def loginAnon(callback: CbCallback): scala.Unit = js.native
  def loginUser(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def loginUserMqtt(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def logoutUser(callback: CbCallback): scala.Unit = js.native
  def registerMasterCallback(callback: CbCallback): scala.Unit = js.native
  def registerUser(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def sendPush(
    users: js.Array[java.lang.String],
    payload: js.Object,
    appId: java.lang.String,
    callback: CbCallback
  ): scala.Unit = js.native
  def setUser(email: java.lang.String, password: java.lang.String): scala.Unit = js.native
}

