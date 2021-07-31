package typings.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Likelihood extends StObject {
  
  var likelihood: Double
}
object Likelihood {
  
  @scala.inline
  def apply(likelihood: Double): Likelihood = {
    val __obj = js.Dynamic.literal(likelihood = likelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[Likelihood]
  }
  
  @scala.inline
  implicit class LikelihoodMutableBuilder[Self <: Likelihood] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLikelihood(value: Double): Self = StObject.set(x, "likelihood", value.asInstanceOf[js.Any])
  }
}
