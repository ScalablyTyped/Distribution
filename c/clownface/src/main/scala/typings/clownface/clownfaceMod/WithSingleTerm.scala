package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithSingleTerm[T /* <: Term */] extends js.Object {
  var term: T
}

object WithSingleTerm {
  @scala.inline
  def apply[T /* <: Term */](term: T): WithSingleTerm[T] = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithSingleTerm[T]]
  }
}

