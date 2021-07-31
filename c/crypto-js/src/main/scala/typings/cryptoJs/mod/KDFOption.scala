package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
trait KDFOption extends StObject {
  
  /**
    * The hasher to use.
    */
  var hasher: js.UndefOr[HasherStatic] = js.undefined
  
  /**
    * The number of iterations to perform.
    */
  var iterations: js.UndefOr[Double] = js.undefined
  
  /**
    * The key size in words to generate.
    */
  var keySize: js.UndefOr[Double] = js.undefined
}
object KDFOption {
  
  @scala.inline
  def apply(): KDFOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KDFOption]
  }
  
  @scala.inline
  implicit class KDFOptionMutableBuilder[Self <: KDFOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasher(value: HasherStatic): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasherUndefined: Self = StObject.set(x, "hasher", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
  }
}
