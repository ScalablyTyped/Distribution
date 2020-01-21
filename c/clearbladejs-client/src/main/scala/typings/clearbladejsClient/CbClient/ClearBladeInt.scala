package typings.clearbladejsClient.CbClient

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
  def Analytics(): typings.clearbladejsClient.CbClient.Analytics = js.native
  def Code(): typings.clearbladejsClient.CbClient.Code = js.native
  def Collection(options: String): typings.clearbladejsClient.CbClient.Collection = js.native
  def Collection(options: CollectionOptionsWithID): typings.clearbladejsClient.CbClient.Collection = js.native
  def Collection(options: CollectionOptionsWithName): typings.clearbladejsClient.CbClient.Collection = js.native
  def Device(): typings.clearbladejsClient.CbClient.Device = js.native
  def Edge(): typings.clearbladejsClient.CbClient.Edge = js.native
  def Item(data: js.Object, collectionID: String): typings.clearbladejsClient.CbClient.Item = js.native
  def Item(data: js.Object, collectionID: ItemOptions): typings.clearbladejsClient.CbClient.Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): typings.clearbladejsClient.CbClient.Messaging = js.native
  def MessagingStats(): typings.clearbladejsClient.CbClient.MessagingStats = js.native
  def Metrics(): typings.clearbladejsClient.CbClient.Metrics = js.native
  def Portal(name: String): typings.clearbladejsClient.CbClient.Portal = js.native
  def Query(options: String): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def Triggers(): typings.clearbladejsClient.CbClient.Triggers = js.native
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

