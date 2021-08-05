package typings.cypressAxe

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.ImpactValue
import typings.axeCore.mod.Result
import typings.axeCore.mod.RunOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Options
    extends StObject
       with RunOptions {
    
    var includedImpacts: js.UndefOr[js.Array[ImpactValue]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludedImpacts(value: js.Array[ImpactValue]): Self = StObject.set(x, "includedImpacts", value.asInstanceOf[js.Any])
      
      inline def setIncludedImpactsUndefined: Self = StObject.set(x, "includedImpacts", js.undefined)
      
      inline def setIncludedImpactsVarargs(value: ImpactValue*): Self = StObject.set(x, "includedImpacts", js.Array(value :_*))
    }
  }
  
  type ViolationCallback = js.Function1[/* violations */ js.Array[Result], Unit]
  
  /* augmented module */
  object axeCoreAugmentingMod {
    
    trait Node extends StObject
  }
  
  object global {
    
    object Cypress {
      
      @js.native
      trait Chainable[Subject] extends StObject {
        
        def checkA11y(): Unit = js.native
        def checkA11y(context: Unit, options: Unit, violationCallback: Unit, skipFailures: Boolean): Unit = js.native
        def checkA11y(context: Unit, options: Unit, violationCallback: ViolationCallback): Unit = js.native
        def checkA11y(context: Unit, options: Unit, violationCallback: ViolationCallback, skipFailures: Boolean): Unit = js.native
        def checkA11y(context: Unit, options: Options): Unit = js.native
        def checkA11y(context: Unit, options: Options, violationCallback: Unit, skipFailures: Boolean): Unit = js.native
        def checkA11y(context: Unit, options: Options, violationCallback: ViolationCallback): Unit = js.native
        def checkA11y(context: Unit, options: Options, violationCallback: ViolationCallback, skipFailures: Boolean): Unit = js.native
        def checkA11y(context: ElementContext): Unit = js.native
        def checkA11y(context: ElementContext, options: Unit, violationCallback: Unit, skipFailures: Boolean): Unit = js.native
        def checkA11y(context: ElementContext, options: Unit, violationCallback: ViolationCallback): Unit = js.native
        def checkA11y(
          context: ElementContext,
          options: Unit,
          violationCallback: ViolationCallback,
          skipFailures: Boolean
        ): Unit = js.native
        def checkA11y(context: ElementContext, options: Options): Unit = js.native
        def checkA11y(context: ElementContext, options: Options, violationCallback: Unit, skipFailures: Boolean): Unit = js.native
        def checkA11y(context: ElementContext, options: Options, violationCallback: ViolationCallback): Unit = js.native
        def checkA11y(
          context: ElementContext,
          options: Options,
          violationCallback: ViolationCallback,
          skipFailures: Boolean
        ): Unit = js.native
        
        def configureAxe(): Unit = js.native
        def configureAxe(options: RunOptions): Unit = js.native
        
        def injectAxe(): Unit = js.native
      }
    }
  }
}
