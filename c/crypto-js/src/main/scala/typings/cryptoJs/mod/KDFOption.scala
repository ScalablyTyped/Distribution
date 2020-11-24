package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
@js.native
trait KDFOption extends js.Object {
  
  /**
    * The hasher to use.
    */
  var hasher: js.UndefOr[HasherStatic] = js.native
  
  /**
    * The number of iterations to perform.
    */
  var iterations: js.UndefOr[Double] = js.native
  
  /**
    * The key size in words to generate.
    */
  var keySize: js.UndefOr[Double] = js.native
}
object KDFOption {
  
  @scala.inline
  def apply(): KDFOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KDFOption]
  }
  
  @scala.inline
  implicit class KDFOptionOps[Self <: KDFOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasher(value: HasherStatic): Self = this.set("hasher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasher: Self = this.set("hasher", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setKeySize(value: Double): Self = this.set("keySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySize: Self = this.set("keySize", js.undefined)
  }
}
