package typings.cypress.Cypress

import typings.cypress.cypressStrings.add
import typings.cypress.cypressStrings.create
import typings.cypress.cypressStrings.get_
import typings.cypress.cypressStrings.logs
import typings.cypress.cypressStrings.toJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// $CommandQueue from `command_queue.coffee` - a lot to type. Might be more useful if it was written in TS
@js.native
trait CommandQueue
  extends StObject
     with ObjectLike {
  
  def add(obj: Any): Any = js.native
  
  def create(): CommandQueue = js.native
  
  def get(): Any = js.native
  def get[K /* <: /* keyof cypress.Cypress.CommandQueue */ logs | add | get_ | toJSON | create */](key: String): /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.CommandQueue[K] */ js.Any = js.native
  
  def logs(filters: Any): Any = js.native
  
  def toJSON(): js.Array[String] = js.native
}
