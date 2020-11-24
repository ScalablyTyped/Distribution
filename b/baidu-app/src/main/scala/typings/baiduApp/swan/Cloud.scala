package typings.baiduApp.swan

import typings.baiduApp.anon.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 云开发
// 文档：https://smartprogram.baidu.com/docs/develop/tutorial/codedir/
@js.native
trait Cloud extends js.Object {
  
  /**
    * 接受一个 name 参数，指定需引用的集合名称
    */
  def collection(name: String): js.Object = js.native
  
  /**
    * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
    */
  def database(options: Env): js.Object = js.native
  
  /**
    * 初始化方法（全局只需一次）
    */
  def init(options: InitCloudOptions): Unit = js.native
}
object Cloud {
  
  @scala.inline
  def apply(collection: String => js.Object, database: Env => js.Object, init: InitCloudOptions => Unit): Cloud = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), database = js.Any.fromFunction1(database), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Cloud]
  }
  
  @scala.inline
  implicit class CloudOps[Self <: Cloud] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollection(value: String => js.Object): Self = this.set("collection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDatabase(value: Env => js.Object): Self = this.set("database", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: InitCloudOptions => Unit): Self = this.set("init", js.Any.fromFunction1(value))
  }
}
