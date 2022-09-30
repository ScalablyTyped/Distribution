package typings.bizcharts.mod

import typings.antvG2.libInterfaceMod.IInteractionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action 的基类
  */
@JSImport("bizcharts", "InteractionAction")
@js.native
abstract class InteractionAction[T] protected ()
  extends typings.bizcharts.coreMod.InteractionAction[T] {
  def this(context: IInteractionContext) = this()
  def this(context: IInteractionContext, cfg: T) = this()
}
