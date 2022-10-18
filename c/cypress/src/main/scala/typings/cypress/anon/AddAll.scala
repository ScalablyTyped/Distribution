package typings.cypress.anon

import typings.cypress.Cypress.CommandFn
import typings.cypress.Cypress.CommandFnWithOriginalFn
import typings.cypress.Cypress.CommandFnWithOriginalFnAndSubject
import typings.cypress.Cypress.CommandFnWithSubject
import typings.cypress.Cypress.CommandFns
import typings.cypress.Cypress.CommandFnsWithSubject
import typings.cypress.Cypress.CommandOptions
import typings.cypress.Cypress.JQueryWithSelector
import typings.cypress.cypressStrings.and
import typings.cypress.cypressStrings.off
import typings.cypress.cypressStrings.on
import typings.cypress.cypressStrings.once
import typings.cypress.cypressStrings.should
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAll extends StObject {
  
  def addAll(fns: CommandFns): Unit = js.native
  def addAll(
    options: CommandOptions & PrevSubject & `4` & `5` & `6` & PrevSubjectArray & `7` & `8` & `9`,
    fns: CommandFnsWithSubject[Any | Document | JQueryWithSelector[HTMLElement] | Unit | Window]
  ): Unit = js.native
  def addAll(options: CommandOptionsprevSubject, fns: CommandFns): Unit = js.native
  def addAll[S](options: CommandOptionsprevSubjectPrevSubject, fns: CommandFnsWithSubject[S]): Unit = js.native
  
  @JSName("add")
  def add_and(name: and, fn: CommandFn[and]): Unit = js.native
  @JSName("add")
  def add_and(
    name: and,
    options: CommandOptions & PrevSubject & `4` & `5` & `6` & PrevSubjectArray & `7` & `8` & `9`,
    fn: CommandFnWithSubject[and, Any | Document | JQueryWithSelector[HTMLElement] | Unit | Window]
  ): Unit = js.native
  @JSName("add")
  def add_and(name: and, options: CommandOptionsprevSubject, fn: CommandFn[and]): Unit = js.native
  @JSName("add")
  def add_and[S](name: and, options: CommandOptionsprevSubjectPrevSubject, fn: CommandFnWithSubject[and, S]): Unit = js.native
  @JSName("add")
  def add_off(name: off, fn: CommandFn[off]): Unit = js.native
  @JSName("add")
  def add_off(
    name: off,
    options: CommandOptions & PrevSubject & `4` & `5` & `6` & PrevSubjectArray & `7` & `8` & `9`,
    fn: CommandFnWithSubject[off, Any | Document | JQueryWithSelector[HTMLElement] | Unit | Window]
  ): Unit = js.native
  @JSName("add")
  def add_off(name: off, options: CommandOptionsprevSubject, fn: CommandFn[off]): Unit = js.native
  @JSName("add")
  def add_off[S](name: off, options: CommandOptionsprevSubjectPrevSubject, fn: CommandFnWithSubject[off, S]): Unit = js.native
  @JSName("add")
  def add_on(name: on, fn: CommandFn[on]): Unit = js.native
  @JSName("add")
  def add_on(
    name: on,
    options: CommandOptions & PrevSubject & `4` & `5` & `6` & PrevSubjectArray & `7` & `8` & `9`,
    fn: CommandFnWithSubject[on, Any | Document | JQueryWithSelector[HTMLElement] | Unit | Window]
  ): Unit = js.native
  @JSName("add")
  def add_on(name: on, options: CommandOptionsprevSubject, fn: CommandFn[on]): Unit = js.native
  @JSName("add")
  def add_on[S](name: on, options: CommandOptionsprevSubjectPrevSubject, fn: CommandFnWithSubject[on, S]): Unit = js.native
  @JSName("add")
  def add_once(name: once, fn: CommandFn[once]): Unit = js.native
  @JSName("add")
  def add_once(
    name: once,
    options: CommandOptions & PrevSubject & `4` & `5` & `6` & PrevSubjectArray & `7` & `8` & `9`,
    fn: CommandFnWithSubject[once, Any | Document | JQueryWithSelector[HTMLElement] | Unit | Window]
  ): Unit = js.native
  @JSName("add")
  def add_once(name: once, options: CommandOptionsprevSubject, fn: CommandFn[once]): Unit = js.native
  @JSName("add")
  def add_once[S](name: once, options: CommandOptionsprevSubjectPrevSubject, fn: CommandFnWithSubject[once, S]): Unit = js.native
  @JSName("add")
  def add_should(name: should, fn: CommandFn[should]): Unit = js.native
  @JSName("add")
  def add_should(
    name: should,
    options: CommandOptions & PrevSubject & `4` & `5` & `6` & PrevSubjectArray & `7` & `8` & `9`,
    fn: CommandFnWithSubject[should, Any | Document | JQueryWithSelector[HTMLElement] | Unit | Window]
  ): Unit = js.native
  @JSName("add")
  def add_should(name: should, options: CommandOptionsprevSubject, fn: CommandFn[should]): Unit = js.native
  @JSName("add")
  def add_should[S](name: should, options: CommandOptionsprevSubjectPrevSubject, fn: CommandFnWithSubject[should, S]): Unit = js.native
  
  @JSName("overwrite")
  def overwrite_and(name: and, fn: CommandFnWithOriginalFn[and]): Unit = js.native
  @JSName("overwrite")
  def overwrite_and(
    name: and,
    fn: CommandFnWithOriginalFnAndSubject[and, Any | Document | JQueryWithSelector[HTMLElement] | Window]
  ): Unit = js.native
  @JSName("overwrite")
  def overwrite_off(name: off, fn: CommandFnWithOriginalFn[off]): Unit = js.native
  @JSName("overwrite")
  def overwrite_off(
    name: off,
    fn: CommandFnWithOriginalFnAndSubject[off, Any | Document | JQueryWithSelector[HTMLElement] | Window]
  ): Unit = js.native
  @JSName("overwrite")
  def overwrite_on(name: on, fn: CommandFnWithOriginalFn[on]): Unit = js.native
  @JSName("overwrite")
  def overwrite_on(
    name: on,
    fn: CommandFnWithOriginalFnAndSubject[on, Any | Document | JQueryWithSelector[HTMLElement] | Window]
  ): Unit = js.native
  @JSName("overwrite")
  def overwrite_once(name: once, fn: CommandFnWithOriginalFn[once]): Unit = js.native
  @JSName("overwrite")
  def overwrite_once(
    name: once,
    fn: CommandFnWithOriginalFnAndSubject[once, Any | Document | JQueryWithSelector[HTMLElement] | Window]
  ): Unit = js.native
  @JSName("overwrite")
  def overwrite_should(name: should, fn: CommandFnWithOriginalFn[should]): Unit = js.native
  @JSName("overwrite")
  def overwrite_should(
    name: should,
    fn: CommandFnWithOriginalFnAndSubject[should, Any | Document | JQueryWithSelector[HTMLElement] | Window]
  ): Unit = js.native
}
