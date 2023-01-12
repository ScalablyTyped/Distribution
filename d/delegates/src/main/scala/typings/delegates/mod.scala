package typings.delegates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(proto: js.Object, target: String): Delegate = (^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Delegate]
  
  @JSImport("delegates", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Delegate {
    def this(proto: js.Object, target: String) = this()
    
    /* CompleteClass */
    override def access(name: String): Delegate = js.native
    
    /* CompleteClass */
    override def fluent(name: String): Delegate = js.native
    
    /* CompleteClass */
    override def getter(name: String): Delegate = js.native
    
    /* CompleteClass */
    override def method(name: String): Delegate = js.native
    
    /* CompleteClass */
    override def setter(name: String): Delegate = js.native
  }
  @JSImport("delegates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Delegate extends StObject {
    
    def access(name: String): Delegate
    
    def fluent(name: String): Delegate
    
    def getter(name: String): Delegate
    
    def method(name: String): Delegate
    
    def setter(name: String): Delegate
  }
  object Delegate {
    
    inline def apply(
      access: String => Delegate,
      fluent: String => Delegate,
      getter: String => Delegate,
      method: String => Delegate,
      setter: String => Delegate
    ): Delegate = {
      val __obj = js.Dynamic.literal(access = js.Any.fromFunction1(access), fluent = js.Any.fromFunction1(fluent), getter = js.Any.fromFunction1(getter), method = js.Any.fromFunction1(method), setter = js.Any.fromFunction1(setter))
      __obj.asInstanceOf[Delegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delegate] (val x: Self) extends AnyVal {
      
      inline def setAccess(value: String => Delegate): Self = StObject.set(x, "access", js.Any.fromFunction1(value))
      
      inline def setFluent(value: String => Delegate): Self = StObject.set(x, "fluent", js.Any.fromFunction1(value))
      
      inline def setGetter(value: String => Delegate): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
      
      inline def setMethod(value: String => Delegate): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setSetter(value: String => Delegate): Self = StObject.set(x, "setter", js.Any.fromFunction1(value))
    }
  }
}
