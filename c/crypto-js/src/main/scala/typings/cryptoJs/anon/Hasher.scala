package typings.cryptoJs.anon

import typings.cryptoJs.mod.HasherStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hasher extends js.Object {
  
  var hasher: js.UndefOr[HasherStatic] = js.native
  
  var iterations: Double = js.native
  
  var keySize: Double = js.native
}
object Hasher {
  
  @scala.inline
  def apply(iterations: Double, keySize: Double): Hasher = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hasher]
  }
  
  @scala.inline
  implicit class HasherOps[Self <: Hasher] (val x: Self) extends AnyVal {
    
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
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySize(value: Double): Self = this.set("keySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasher(value: HasherStatic): Self = this.set("hasher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasher: Self = this.set("hasher", js.undefined)
  }
}
