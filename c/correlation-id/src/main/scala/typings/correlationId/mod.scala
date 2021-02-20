package typings.correlationId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("correlation-id", "bindId")
  @js.native
  def bindId[T /* <: js.Function1[/* repeated */ js.Any, _] */](id: String, work: T): T = js.native
  @JSImport("correlation-id", "bindId")
  @js.native
  def bindId[T /* <: js.Function1[/* repeated */ js.Any, _] */](work: T): T = js.native
  
  @JSImport("correlation-id", "getId")
  @js.native
  def getId(): js.UndefOr[String] = js.native
  
  @JSImport("correlation-id", "withId")
  @js.native
  def withId(id: String, work: js.Function0[Unit]): Unit = js.native
  @JSImport("correlation-id", "withId")
  @js.native
  def withId(work: js.Function0[Unit]): Unit = js.native
}
