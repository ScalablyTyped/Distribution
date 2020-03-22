package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncScriptLoader extends js.Object {
  var applicationContext: ApplicationContext = js.native
  var cacheModules: js.Object = js.native
  var loaderDir: String = js.native
  /**
    * AsyncScriptLoader get script from cache or new.
    *
    * @param   uri
    * @param   deps id
    * @return  module
    * @api     public
    */
  def get(uri: String, deps: js.Array[String]): js.Object = js.native
  /**
    * AsyncScriptLoader get loaded beans list.
    *
    * @return  loaded beans
    * @api     public
    */
  def getLoadBeans(): js.Array[js.Object] = js.native
  /**
    * AsyncScriptLoader get bean path through bean id.
    *
    * @param   id
    * @return  bean path
    * @api     public
    */
  def getPathById(id: String): String = js.native
  /**
    * AsyncScriptLoader load beans asynchronously.
    *
    * @param   ids loaded beans ids
    * @param   cb callback function
    * @api     public
    */
  def load(ids: js.Array[String]): Unit = js.native
  def load(ids: js.Array[String], cb: CallbackFunc): Unit = js.native
  /**
    * AsyncScriptLoader register script with id, meta.
    *
    * @param   id
    * @param   beanMeta
    * @api     public
    */
  def module(id: String, beanMeta: js.Object): Unit = js.native
  /**
    * AsyncScriptLoader resolve uri path with refUri.
    *
    * @param   id
    * @param   refUri
    * @return  resolved path
    * @api     public
    */
  def resolve(id: String, refUri: String): String = js.native
  /**
    * AsyncScriptLoader resolve deps through bean meta.
    *
    * @param   beanMeta
    * @return  resolved deps
    * @api     public
    */
  def resolveDeps(beanMeta: js.Object): js.Array[String] = js.native
  /**
    * AsyncScriptLoader save load script with uri meta.
    *
    * @param   uri
    * @param   meta
    * @api     public
    */
  def save(uri: String, meta: js.Object): Unit = js.native
  /**
    * AsyncScriptLoader set applicationContext reference.
    *
    * @param   applicationContext
    * @api     public
    */
  def setApplicationContext(applicationContext: ApplicationContext): Unit = js.native
}

