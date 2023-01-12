package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
  * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
  */
trait Lifetimes extends StObject {
  
  /**
    * 组件生命周期函数，在组件实例进入页面节点树时执行
    */
  def attached(): Unit
  
  /**
    * 组件生命周期函数，在组件实例进入页面节点树时执行
    * 注意此时不能调用 setData
    */
  def created(): Unit
  
  /**
    * 组件生命周期函数，在组件实例被从页面节点树移除时执行
    */
  def detached(): Unit
  
  /**
    * 组件生命周期函数，在组件实例被移动到节点树另一个位置时执行
    */
  def moved(): Unit
  
  /**
    * 组件生命周期函数，在组件布局完成后执行，此时可以获取节点信息
    * 使用 [SelectorQuery](https://smartprogram.baidu.com/docs/develop/api/show_query/)
    */
  def ready(): Unit
}
object Lifetimes {
  
  inline def apply(
    attached: () => Unit,
    created: () => Unit,
    detached: () => Unit,
    moved: () => Unit,
    ready: () => Unit
  ): Lifetimes = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[Lifetimes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lifetimes] (val x: Self) extends AnyVal {
    
    inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
  }
}
