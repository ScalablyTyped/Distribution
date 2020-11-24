package typings.deta.mod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetaBase extends js.Object {
  
  def delete(key: String): js.Promise[Unit] = js.native
  
  def fetch(): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: js.UndefOr[scala.Nothing], limit: js.UndefOr[scala.Nothing], buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: js.UndefOr[scala.Nothing], limit: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: js.UndefOr[scala.Nothing], limit: Double, buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: DetaBaseQuery): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: DetaBaseQuery, limit: js.UndefOr[scala.Nothing], buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: DetaBaseQuery, limit: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  def fetch(query: DetaBaseQuery, limit: Double, buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
  
  def get(key: String): js.Promise[Serializable | Null] = js.native
  
  def insert[Data](data: Data, key: String): js.Promise[Data] = js.native
  
  def put[Data](data: Data): js.Promise[Data] = js.native
  def put[Data](data: Data, key: String): js.Promise[Data] = js.native
  
  def putMany[Items](items: Items): js.Promise[Items] = js.native
  
  def update(updates: DetaBaseUpdates, key: String): js.Promise[Unit] = js.native
  
  var util: DetaBaseUtil = js.native
}
