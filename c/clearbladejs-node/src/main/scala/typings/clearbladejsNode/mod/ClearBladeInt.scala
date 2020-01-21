package typings.clearbladejsNode.mod

import typings.request.mod.RequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeInt extends js.Object {
  def Code(): typings.clearbladejsNode.mod.Code = js.native
  def Collection(options: String): typings.clearbladejsNode.mod.Collection = js.native
  def Collection(options: CollectionOptionsWithID): typings.clearbladejsNode.mod.Collection = js.native
  def Collection(options: CollectionOptionsWithName): typings.clearbladejsNode.mod.Collection = js.native
  def Item(data: js.Object, options: String): typings.clearbladejsNode.mod.Item = js.native
  def Item(data: js.Object, options: ItemOptions): typings.clearbladejsNode.mod.Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): typings.clearbladejsNode.mod.Messaging = js.native
  def Query(options: String): QueryObj = js.native
  def Query(options: QueryOptionsWithCollection): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def User(): AppUser = js.native
  def addFilterToQuery(queryObj: QueryObj, condition: QueryConditions, key: String, value: QueryValue): Unit = js.native
  def addSortToQuery(queryObj: QueryObj, direction: QuerySortDirections, column: String): Unit = js.native
  def addToQuery(queryObj: QueryObj, key: String, value: String): Unit = js.native
  def execute(error: js.Object, response: js.Object, callback: CbCallback): Unit = js.native
  def init(options: InitOptions): Unit = js.native
  def isObjectEmpty(obj: js.Object): Boolean = js.native
  def logger(message: String): Unit = js.native
  def loginAnon(callback: CbCallback): Unit = js.native
  def loginUser(email: String, password: String, callback: CbCallback): Unit = js.native
  def logoutUser(callback: CbCallback): Unit = js.native
  def makeKVPair(key: String, value: String): KeyValuePair = js.native
  def parseOperationQuery(query: Query): String = js.native
  def parseQuery(query: Query): String = js.native
  def parseQuery(query: QueryObj): String = js.native
  def registerUser(email: String, password: String, callback: CbCallback): Unit = js.native
  def request(options: RequestOptions, callback: RequestCallback): Unit = js.native
  def sendPush(users: js.Array[String], payload: js.Object, appId: String, callback: CbCallback): Unit = js.native
  def setUser(email: String, password: String): Unit = js.native
  def validateEmailPassword(email: String, password: String): Unit = js.native
}

