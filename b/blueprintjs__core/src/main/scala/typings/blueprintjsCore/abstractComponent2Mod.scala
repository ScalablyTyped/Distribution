package typings.blueprintjsCore

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractComponent2Mod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/abstractComponent2", "AbstractComponent2")
  @js.native
  abstract class AbstractComponent2[P, S, SS] protected () extends Component[P, S, SS] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
    
    /**
      * Clear all known animation frame requests.
      */
    def cancelAnimationFrames(): Unit = js.native
    
    /**
      * Clear all known timeouts.
      */
    def clearTimeouts(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAbstractComponent2(_prevProps: P, _prevState: S): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAbstractComponent2(_prevProps: P, _prevState: S, _snapshot: SS): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAbstractComponent2(): Unit = js.native
    
    /**
      * Request an animation frame and remember its ID.
      * All pending requests will be canceled when component unmounts.
      * @returns a "cancel" function that will cancel the request when invoked.
      */
    def requestAnimationFrame(callback: js.Function0[Unit]): js.Function0[Unit] = js.native
    
    var requestIds: js.Any = js.native
    
    /**
      * Set a timeout and remember its ID.
      * All stored timeouts will be cleared when component unmounts.
      * @returns a "cancel" function that will clear timeout when invoked.
      */
    def setTimeout(callback: js.Function0[Unit]): js.Function0[Unit] = js.native
    def setTimeout(callback: js.Function0[Unit], timeout: Double): js.Function0[Unit] = js.native
    
    var timeoutIds: js.Any = js.native
    
    /**
      * Ensures that the props specified for a component are valid.
      * Implementations should check that props are valid and usually throw an Error if they are not.
      * Implementations should not duplicate checks that the type system already guarantees.
      *
      * This method should be used instead of React's
      * [propTypes](https://facebook.github.io/react/docs/reusable-components.html#prop-validation) feature.
      * Like propTypes, these runtime checks run only in development mode.
      */
    /* protected */ def validateProps(_props: P): Unit = js.native
  }
}
