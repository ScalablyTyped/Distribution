package typings.connectSequence

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-sequence", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ConnectSequence {
    def this(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], next: NextFunction) = this()
    
    /* CompleteClass */
    override def append(middleware: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): this.type = js.native
    
    /* CompleteClass */
    override def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): this.type = js.native
    
    /* CompleteClass */
    override def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]): this.type = js.native
    
    /* CompleteClass */
    override def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]): this.type = js.native
    
    /* CompleteClass */
    override def run(): Unit = js.native
  }
  
  trait ConnectSequence extends StObject {
    
    def append(middleware: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): this.type
    
    def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): this.type
    
    def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]): this.type
    
    def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]): this.type
    
    def run(): Unit
  }
  object ConnectSequence {
    
    @scala.inline
    def apply(
      append: /* repeated */ RequestHandler[ParamsDictionary, js.Any, js.Any, Query] => ConnectSequence,
      appendIf: (Boolean, RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) => ConnectSequence,
      appendList: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] => ConnectSequence,
      appendListIf: (Boolean, js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]) => ConnectSequence,
      run: () => Unit
    ): ConnectSequence = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendIf = js.Any.fromFunction2(appendIf), appendList = js.Any.fromFunction1(appendList), appendListIf = js.Any.fromFunction2(appendListIf), run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[ConnectSequence]
    }
    
    @scala.inline
    implicit class ConnectSequenceMutableBuilder[Self <: ConnectSequence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: /* repeated */ RequestHandler[ParamsDictionary, js.Any, js.Any, Query] => ConnectSequence): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendIf(value: (Boolean, RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) => ConnectSequence): Self = StObject.set(x, "appendIf", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAppendList(value: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] => ConnectSequence): Self = StObject.set(x, "appendList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendListIf(
        value: (Boolean, js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]) => ConnectSequence
      ): Self = StObject.set(x, "appendListIf", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
}
