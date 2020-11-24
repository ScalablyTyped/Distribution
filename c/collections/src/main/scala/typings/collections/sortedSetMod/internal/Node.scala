package typings.collections.sortedSetMod.internal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node[T] extends js.Object {
  
  def checkIntegrity(plus: js.Any*): Double = js.native
  
  def getNext(plus: js.Any*): js.UndefOr[Node[T]] = js.native
  
  def getPrevious(plus: js.Any*): js.UndefOr[Node[T]] = js.native
  
  def log(charmap: js.Any, logNode: js.Any, log: js.Any, logAbove: js.Any): js.Any = js.native
  
  def reduce(
    cb: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any,
    index: Double,
    thisp: js.Any,
    tree: js.Any,
    depth: Double
  ): js.Any = js.native
  
  def summary(plus: js.Any*): String = js.native
  
  def touch(plus: js.Any*): Unit = js.native
}
object Node {
  
  @scala.inline
  def apply[T](
    checkIntegrity: /* repeated */ js.Any => Double,
    getNext: /* repeated */ js.Any => js.UndefOr[Node[T]],
    getPrevious: /* repeated */ js.Any => js.UndefOr[Node[T]],
    log: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    reduce: (js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ], js.Any, Double, js.Any, js.Any, Double) => js.Any,
    summary: /* repeated */ js.Any => String,
    touch: /* repeated */ js.Any => Unit
  ): Node[T] = {
    val __obj = js.Dynamic.literal(checkIntegrity = js.Any.fromFunction1(checkIntegrity), getNext = js.Any.fromFunction1(getNext), getPrevious = js.Any.fromFunction1(getPrevious), log = js.Any.fromFunction4(log), reduce = js.Any.fromFunction6(reduce), summary = js.Any.fromFunction1(summary), touch = js.Any.fromFunction1(touch))
    __obj.asInstanceOf[Node[T]]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node[_], T] (val x: Self with Node[T]) extends AnyVal {
    
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
    def setCheckIntegrity(value: /* repeated */ js.Any => Double): Self = this.set("checkIntegrity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNext(value: /* repeated */ js.Any => js.UndefOr[Node[T]]): Self = this.set("getNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrevious(value: /* repeated */ js.Any => js.UndefOr[Node[T]]): Self = this.set("getPrevious", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("log", js.Any.fromFunction4(value))
    
    @scala.inline
    def setReduce(
      value: (js.Function4[
          /* result */ js.UndefOr[js.Any], 
          /* val */ js.UndefOr[js.Any], 
          /* key */ js.UndefOr[js.Any], 
          /* collection */ js.UndefOr[js.Any], 
          _
        ], js.Any, Double, js.Any, js.Any, Double) => js.Any
    ): Self = this.set("reduce", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSummary(value: /* repeated */ js.Any => String): Self = this.set("summary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouch(value: /* repeated */ js.Any => Unit): Self = this.set("touch", js.Any.fromFunction1(value))
  }
}
