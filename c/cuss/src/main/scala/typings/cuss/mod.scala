package typings.cuss

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cuss", JSImport.Namespace)
  @js.native
  val ^ : Cuss = js.native
  
  type Cuss = js.Object with (/**
    * Map of profanities to sureness rating
    */
  StringDictionary[SurenessRating])
  
  /* Rewritten from type alias, can be one of: 
    - typings.cuss.cussNumbers.`0`
    - typings.cuss.cussNumbers.`1`
    - typings.cuss.cussNumbers.`2`
  */
  trait SurenessRating extends StObject
  object SurenessRating {
    
    @scala.inline
    def `0`: typings.cuss.cussNumbers.`0` = 0.asInstanceOf[typings.cuss.cussNumbers.`0`]
    
    @scala.inline
    def `1`: typings.cuss.cussNumbers.`1` = 1.asInstanceOf[typings.cuss.cussNumbers.`1`]
    
    @scala.inline
    def `2`: typings.cuss.cussNumbers.`2` = 2.asInstanceOf[typings.cuss.cussNumbers.`2`]
  }
  
  type _To = Cuss
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Cuss = ^
}
