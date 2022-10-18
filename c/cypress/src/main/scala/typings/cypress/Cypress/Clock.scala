package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The clock starts at the unix epoch (timestamp of 0). This means that when you instantiate new Date in your application, it will have a time of January 1st, 1970.
  */
@js.native
trait Clock extends StObject {
  
  /**
    * Restore all overridden native functions.
    * This is automatically called between tests, so should not generally be needed.
    * @see https://on.cypress.io/clock
    * @example
    *   cy.clock()
    *   cy.visit('/')
    *   ...
    *   cy.clock().then(clock => {
    *     clock.restore()
    *   })
    *   // or use this shortcut
    *   cy.clock().invoke('restore')
    */
  def restore(): Unit = js.native
  
  /**
    * Change the time without invoking any timers.
    *
    * Default value with no argument or undefined is 0.
    *
    * This can be useful if you need to change the time by an hour
    * while there is a setInterval registered that may otherwise run thousands
    * of times.
    * @see https://on.cypress.io/clock
    * @example
    *   cy.clock()
    *   cy.visit('/')
    *   ...
    *   cy.clock().then(clock => {
    *     clock.setSystemTime(60 * 60 * 1000)
    *   })
    *   // or use this shortcut
    *   cy.clock().invoke('setSystemTime', 60 * 60 * 1000)
    */
  def setSystemTime(): Unit = js.native
  def setSystemTime(now: js.Date): Unit = js.native
  def setSystemTime(now: Double): Unit = js.native
  
  /**
    * Move the clock the specified number of `milliseconds`.
    * Any timers within the affected range of time will be called.
    * @param time Number in ms to advance the clock
    * @see https://on.cypress.io/tick
    */
  def tick(time: Double): Unit = js.native
}
