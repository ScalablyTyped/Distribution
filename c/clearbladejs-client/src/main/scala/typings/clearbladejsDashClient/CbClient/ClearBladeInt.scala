package typings.clearbladejsDashClient.CbClient

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
  def Analytics(): typings.clearbladejsDashClient.CbClient.Analytics = js.native
  def Code(): typings.clearbladejsDashClient.CbClient.Code = js.native
  def Collection(options: String): typings.clearbladejsDashClient.CbClient.Collection = js.native
  def Collection(options: CollectionOptionsWithID): typings.clearbladejsDashClient.CbClient.Collection = js.native
  def Collection(options: CollectionOptionsWithName): typings.clearbladejsDashClient.CbClient.Collection = js.native
  def Device(): typings.clearbladejsDashClient.CbClient.Device = js.native
  def Edge(): typings.clearbladejsDashClient.CbClient.Edge = js.native
  def Item(data: js.Object, collectionID: String): typings.clearbladejsDashClient.CbClient.Item = js.native
  def Item(data: js.Object, collectionID: ItemOptions): typings.clearbladejsDashClient.CbClient.Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): typings.clearbladejsDashClient.CbClient.Messaging = js.native
  def MessagingStats(): typings.clearbladejsDashClient.CbClient.MessagingStats = js.native
  def Metrics(): typings.clearbladejsDashClient.CbClient.Metrics = js.native
  def Portal(name: String): typings.clearbladejsDashClient.CbClient.Portal = js.native
  def Query(options: String): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def Triggers(): typings.clearbladejsDashClient.CbClient.Triggers = js.native
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

