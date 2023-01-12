package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.bizcharts.anon.ComponentStack
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithRef
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactErrorBoundary.anon.Error
import typings.reactErrorBoundary.mod.ErrorBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundaryErrorBoundaryMod {
  
  @JSImport("bizcharts/lib/boundary/ErrorBoundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/boundary/ErrorBoundary", JSImport.Default)
  @js.native
  open class default protected () extends ErrorBoundary {
    def this(props: PropsWithRef[PropsWithChildren[typings.reactErrorBoundary.mod.ErrorBoundaryProps]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: PropsWithRef[PropsWithChildren[typings.reactErrorBoundary.mod.ErrorBoundaryProps]],
      context: Any
    ) = this()
  }
  object default {
    
    @JSImport("bizcharts/lib/boundary/ErrorBoundary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
  }
  
  inline def ErrorFallback(args: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ErrorFallback")(args.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def setDefaultErrorFallback(CustComponents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultErrorFallback")(CustComponents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ErrorBoundaryProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var fallback: js.UndefOr[ReactElement | Null] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[/* prevResetKeys */ js.Array[Any], /* resetKeys */ js.Array[Any], Unit]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryProps {
    
    inline def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBoundaryProps] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetKeysChange(value: (/* prevResetKeys */ js.Array[Any], /* resetKeys */ js.Array[Any]) => Unit): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2(value))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
}
