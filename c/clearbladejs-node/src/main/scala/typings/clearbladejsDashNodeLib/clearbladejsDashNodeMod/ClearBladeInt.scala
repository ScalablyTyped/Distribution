package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeInt extends js.Object {
  def Code(): Code = js.native
  def Collection(options: CollectionOptionsWithID): Collection = js.native
  def Collection(options: CollectionOptionsWithName): Collection = js.native
  def Collection(options: java.lang.String): Collection = js.native
  def Item(data: js.Object, options: ItemOptions): Item = js.native
  def Item(data: js.Object, options: java.lang.String): Item = js.native
  def Messaging(options: MessagingOptions, callback: CbCallback): Messaging = js.native
  def Query(options: QueryOptionsWithCollection): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  def Query(options: java.lang.String): QueryObj = js.native
  def User(): AppUser = js.native
  def addFilterToQuery(queryObj: QueryObj, condition: QueryConditions, key: java.lang.String, value: QueryValue): scala.Unit = js.native
  def addSortToQuery(queryObj: QueryObj, direction: QuerySortDirections, column: java.lang.String): scala.Unit = js.native
  def addToQuery(queryObj: QueryObj, key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def execute(error: js.Object, response: js.Object, callback: CbCallback): scala.Unit = js.native
  def init(options: InitOptions): scala.Unit = js.native
  def isObjectEmpty(obj: js.Object): scala.Boolean = js.native
  def logger(message: java.lang.String): scala.Unit = js.native
  def loginAnon(callback: CbCallback): scala.Unit = js.native
  def loginUser(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def logoutUser(callback: CbCallback): scala.Unit = js.native
  def makeKVPair(key: java.lang.String, value: java.lang.String): KeyValuePair = js.native
  def parseOperationQuery(query: Query): java.lang.String = js.native
  def parseQuery(query: Query): java.lang.String = js.native
  def parseQuery(query: QueryObj): java.lang.String = js.native
  def registerUser(email: java.lang.String, password: java.lang.String, callback: CbCallback): scala.Unit = js.native
  def request(options: RequestOptions, callback: requestLib.requestMod.requestNs.RequestCallback): scala.Unit = js.native
  def sendPush(
    users: js.Array[java.lang.String],
    payload: js.Object,
    appId: java.lang.String,
    callback: CbCallback
  ): scala.Unit = js.native
  def setUser(email: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def validateEmailPassword(email: java.lang.String, password: java.lang.String): scala.Unit = js.native
}

