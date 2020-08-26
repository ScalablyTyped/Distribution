package typings.cypressAxe.mod

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Cypress extends js.Object {
    @js.native
    trait Chainable[Subject] extends js.Object {
      def checkA11y(): Unit = js.native
      def checkA11y(
        context: js.UndefOr[ElementContext],
        options: js.UndefOr[scala.Nothing],
        violationCallback: js.UndefOr[scala.Nothing],
        skipFailures: Boolean
      ): Unit = js.native
      def checkA11y(
        context: js.UndefOr[ElementContext],
        options: js.UndefOr[scala.Nothing],
        violationCallback: ViolationCallback
      ): Unit = js.native
      def checkA11y(
        context: js.UndefOr[ElementContext],
        options: js.UndefOr[scala.Nothing],
        violationCallback: ViolationCallback,
        skipFailures: Boolean
      ): Unit = js.native
      def checkA11y(context: js.UndefOr[ElementContext], options: Options): Unit = js.native
      def checkA11y(
        context: js.UndefOr[ElementContext],
        options: Options,
        violationCallback: js.UndefOr[scala.Nothing],
        skipFailures: Boolean
      ): Unit = js.native
      def checkA11y(context: js.UndefOr[ElementContext], options: Options, violationCallback: ViolationCallback): Unit = js.native
      def checkA11y(
        context: js.UndefOr[ElementContext],
        options: Options,
        violationCallback: ViolationCallback,
        skipFailures: Boolean
      ): Unit = js.native
      def checkA11y(context: ElementContext): Unit = js.native
      def configureAxe(): Unit = js.native
      def configureAxe(options: RunOptions): Unit = js.native
      def injectAxe(): Unit = js.native
    }
    
  }
  
}

