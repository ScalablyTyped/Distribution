package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeInt extends js.Object {
  var URI: String = js.native
  var defaultQoS: MessagingQOS = js.native
  var logging: Boolean = js.native
  var masterSecret: String = js.native
  var messagingPort: Double = js.native
  var messagingURI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  def Analytics(): typings.clearbladejsDashClient.CbClientNs.Analytics = js.native
  def Code(): typings.clearbladejsDashClient.CbClientNs.Code = js.native
  def Collection(options: String): typings.clearbladejsDashClient.CbClientNs.Collection = js.native
  def Collection(options: CollectionOptionsWithID): typings.clearbladejsDashClient.CbClientNs.Collection = js.native
  def Collection(options: CollectionOptionsWithName): typings.clearbladejsDashClient.CbClientNs.Collection = js.native
  def Device(): typings.clearbladejsDashClient.CbClientNs.Device = js.native
  def Edge(): typings.clearbladejsDashClient.CbClientNs.Edge = js.native
  def Item(data: js.Object, collectionID: String): typings.clearbladejsDashClient.CbClientNs.Item = js.native
  def Item(data: js.Object, collectionID: ItemOptions): typings.clearbladejsDashClient.CbClientNs.Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): typings.clearbladejsDashClient.CbClientNs.Messaging = js.native
  def MessagingStats(): typings.clearbladejsDashClient.CbClientNs.MessagingStats = js.native
  def Metrics(): typings.clearbladejsDashClient.CbClientNs.Metrics = js.native
  def Portal(name: String): typings.clearbladejsDashClient.CbClientNs.Portal = js.native
  def Query(options: String): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def Triggers(): typings.clearbladejsDashClient.CbClientNs.Triggers = js.native
  def User(): AppUser = js.native
  def getAllCollections(callback: CbCallback): Unit = js.native
  def getEdges(query: Query, callback: CbCallback): Unit = js.native
  def init(options: InitOptions): Unit = js.native
  def isCurrentUserAuthenticated(callback: CbCallback): Unit = js.native
  def loginAnon(callback: CbCallback): Unit = js.native
  def loginUser(email: String, password: String, callback: CbCallback): Unit = js.native
  def loginUserMqtt(email: String, password: String, callback: CbCallback): Unit = js.native
  def logoutUser(callback: CbCallback): Unit = js.native
  def registerMasterCallback(callback: CbCallback): Unit = js.native
  def registerUser(email: String, password: String, callback: CbCallback): Unit = js.native
  def sendPush(users: js.Array[String], payload: js.Object, appId: String, callback: CbCallback): Unit = js.native
  def setUser(email: String, password: String): Unit = js.native
}

