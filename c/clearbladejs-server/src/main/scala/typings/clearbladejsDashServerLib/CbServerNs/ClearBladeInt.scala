package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeInt extends js.Object {
  var Timer: TimerClass = js.native
  var Trigger: TriggerClass = js.native
  def Code(): Code = js.native
  def Collection(options: CollectionOptionsWithCollection): Collection = js.native
  def Collection(options: CollectionOptionsWithID): Collection = js.native
  def Collection(options: CollectionOptionsWithName): Collection = js.native
  def Collection(options: java.lang.String): Collection = js.native
  def Deployment(): Deployment = js.native
  def Device(): Device = js.native
  def Item(data: js.Object, options: ItemOptions): Item = js.native
  def Item(data: js.Object, options: java.lang.String): Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): Messaging = js.native
  def Query(options: QueryOptionsWithCollection): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def User(): AppUser = js.native
  def about(): java.lang.String = js.native
  def addFilterToQuery(queryObj: QueryObj, condition: QueryConditions, key: java.lang.String, value: QueryValue): scala.Unit = js.native
  def addSortToQuery(queryObj: QueryObj, direction: QuerySortDirections, column: java.lang.String): scala.Unit = js.native
  def addToQuery(queryObj: QueryObj, key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def createDevice(name: java.lang.String, data: js.Object, causeTrigger: scala.Boolean, callback: CbCallback): scala.Unit = js.native
  def deleteDevice(name: java.lang.String, causeTrigger: scala.Boolean, callback: CbCallback): scala.Unit = js.native
  def edgeId(): java.lang.String = js.native
  def execute(error: js.Object, response: js.Object, callback: CbCallback): js.Any = js.native
  def getAllCollections(callback: CbCallback): scala.Unit = js.native
  def getAllDevicesForSystem(callback: CbCallback): scala.Unit = js.native
  def getDeviceByName(name: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def http(): js.Object = js.native
  def init(options: clearbladejsDashServerLib.Anon_Request): scala.Unit = js.native
  def init(options: InitOptions): scala.Unit = js.native
  def isCurrentUserAuthenticated(callback: CbCallback): scala.Unit = js.native
  def isEdge(callback: CbCallback): scala.Boolean = js.native
  def isObjectEmpty(obj: js.Object): scala.Boolean = js.native
  def logger(message: java.lang.String): scala.Unit = js.native
  def loginAnon(callback: CbCallback): scala.Unit = js.native
  def loginUser(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def logoutUser(callback: CbCallback): scala.Unit = js.native
  def makeKVPair(key: java.lang.String, value: java.lang.String): KeyValuePair = js.native
  def newCollection(name: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def parseOperationQuery(query: Query): java.lang.String = js.native
  def parseQuery(query: Query): java.lang.String = js.native
  def parseQuery(query: QueryObj): java.lang.String = js.native
  def registerUser(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def setUser(email: java.lang.String, authToken: java.lang.String, userId: java.lang.String): scala.Unit = js.native
  def updateDevice(name: java.lang.String, data: js.Object, causeTrigger: scala.Boolean, callback: CbCallback): scala.Unit = js.native
  def validateEmailPassword(email: java.lang.String, password: java.lang.String): scala.Unit = js.native
}

