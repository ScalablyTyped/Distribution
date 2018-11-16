package typings
package atBlueprintjsCoreLib.libEsmCommonAbstractComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/abstractComponent", "AbstractComponent")
@js.native
abstract class AbstractComponent[P, S] ()
  extends reactLib.reactMod.Component[P, S, js.Any] {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
  /** Component displayName should be `public static`. This property exists to prevent incorrect usage. */
  var displayName: scala.Nothing = js.native
  var timeoutIds: js.Any = js.native
  /**
       * Clear all known timeouts.
       */
  def clearTimeouts(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MAbstractComponent(nextProps: P with atBlueprintjsCoreLib.Anon_Children): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAbstractComponent(): scala.Unit = js.native
  /**
       * Set a timeout and remember its ID.
       * All stored timeouts will be cleared when component unmounts.
       * @returns a "cancel" function that will clear timeout when invoked.
       */
  def setTimeout(callback: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  /**
       * Set a timeout and remember its ID.
       * All stored timeouts will be cleared when component unmounts.
       * @returns a "cancel" function that will clear timeout when invoked.
       */
  def setTimeout(callback: js.Function0[scala.Unit], timeout: scala.Double): js.Function0[scala.Unit] = js.native
  /**
       * Ensures that the props specified for a component are valid.
       * Implementations should check that props are valid and usually throw an Error if they are not.
       * Implementations should not duplicate checks that the type system already guarantees.
       *
       * This method should be used instead of React's
       * [propTypes](https://facebook.github.io/react/docs/reusable-components.html#prop-validation) feature.
       * Like propTypes, these runtime checks run only in development mode.
       */
  /* protected */ def validateProps(`_`: P with atBlueprintjsCoreLib.Anon_Children): scala.Unit = js.native
}

