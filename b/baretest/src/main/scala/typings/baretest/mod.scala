package typings.baretest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(headline: String): TesterFunctionObject = ^.asInstanceOf[js.Dynamic].apply(headline.asInstanceOf[js.Any]).asInstanceOf[TesterFunctionObject]
  
  @JSImport("baretest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type SyncOrAsyncVoidFunction = js.Function0[Unit | js.Promise[Unit]]
  
  type TesterFunction = js.Function2[/* name */ String, /* fn */ SyncOrAsyncVoidFunction, Unit]
  
  @js.native
  trait TesterFunctionObject
    extends TesterFunction
       with TesterSubFunctions {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* name */ String, arg2: /* fn */ SyncOrAsyncVoidFunction): Unit = js.native
  }
  
  @js.native
  trait TesterSubFunctions extends StObject {
    
    def after(fn: SyncOrAsyncVoidFunction): Unit = js.native
    
    def before(fn: SyncOrAsyncVoidFunction): Unit = js.native
    
    def only(name: String, fn: SyncOrAsyncVoidFunction): Unit = js.native
    
    def run(): js.Promise[Boolean] = js.native
    
    def skip(): Unit = js.native
    def skip(name: String): Unit = js.native
    def skip(name: String, fn: SyncOrAsyncVoidFunction): Unit = js.native
    def skip(name: Unit, fn: SyncOrAsyncVoidFunction): Unit = js.native
  }
}
