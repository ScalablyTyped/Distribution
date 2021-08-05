package typings.cuss

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cuss", JSImport.Namespace)
  @js.native
  val ^ : Cuss = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait Cuss
    extends StObject
       with /**
    * Map of profanities to sureness rating
    */
  /* phrase */ StringDictionary[SurenessRating]
  object Cuss {
    
    inline def apply(): Cuss = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cuss]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cuss.cussNumbers.`0`
    - typings.cuss.cussNumbers.`1`
    - typings.cuss.cussNumbers.`2`
  */
  trait SurenessRating extends StObject
  object SurenessRating {
    
    inline def `0`: typings.cuss.cussNumbers.`0` = 0.asInstanceOf[typings.cuss.cussNumbers.`0`]
    
    inline def `1`: typings.cuss.cussNumbers.`1` = 1.asInstanceOf[typings.cuss.cussNumbers.`1`]
    
    inline def `2`: typings.cuss.cussNumbers.`2` = 2.asInstanceOf[typings.cuss.cussNumbers.`2`]
  }
  
  type _To = Cuss
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Cuss = ^
}
