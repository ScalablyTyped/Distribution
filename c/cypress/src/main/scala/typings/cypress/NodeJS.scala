package typings.cypress

import typings.cypress.Mocha.MochaGlobals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  // Forward declaration for `NodeJS.EventEmitter` from node.d.ts.
  // Required by Mocha.Runnable, Mocha.Runner, and Mocha.Suite.
  // NOTE: Mocha *must not* have a direct dependency on @types/node.
  // tslint:disable-next-line no-empty-interface
  trait EventEmitter extends StObject
  
  // Augments NodeJS's `global` object when node.d.ts is loaded
  // tslint:disable-next-line no-empty-interface
  type Global = MochaGlobals
}
