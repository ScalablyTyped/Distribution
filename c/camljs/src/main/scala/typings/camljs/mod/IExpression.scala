package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpression extends IGroupable {
  
  /** Adds And clause to the query. */
  def And(): IFieldExpression = js.native
  
  /** Adds Or clause to the query. */
  def Or(): IFieldExpression = js.native
}
