package typings.deepmerge

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deepmerge", JSImport.Namespace)
  @js.native
  def apply[T](x: Partial[T], y: Partial[T]): T = js.native
  @JSImport("deepmerge", JSImport.Namespace)
  @js.native
  def apply[T](x: Partial[T], y: Partial[T], options: Options): T = js.native
  
  @JSImport("deepmerge", "all")
  @js.native
  def all(objects: js.Array[js.Object]): js.Object = js.native
  @JSImport("deepmerge", "all")
  @js.native
  def all(objects: js.Array[js.Object], options: Options): js.Object = js.native
  @JSImport("deepmerge", "all")
  @js.native
  def all_T_T[T](objects: js.Array[Partial[T]]): T = js.native
  @JSImport("deepmerge", "all")
  @js.native
  def all_T_T[T](objects: js.Array[Partial[T]], options: Options): T = js.native
  
  @js.native
  trait Options extends StObject {
    
    var arrayMerge: js.UndefOr[
        js.Function3[
          /* target */ js.Array[_], 
          /* source */ js.Array[_], 
          /* options */ js.UndefOr[this.type], 
          js.Array[_]
        ]
      ] = js.native
    
    @JSName("clone")
    var clone_FOptions: js.UndefOr[Boolean] = js.native
    
    var customMerge: js.UndefOr[
        js.Function2[
          /* key */ String, 
          /* options */ js.UndefOr[this.type], 
          js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
        ]
      ] = js.native
    
    var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, Boolean]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayMerge(
        value: (/* target */ js.Array[_], /* source */ js.Array[_], /* options */ js.UndefOr[Options]) => js.Array[_]
      ): Self = StObject.set(x, "arrayMerge", js.Any.fromFunction3(value))
      
      @scala.inline
      def setArrayMergeUndefined: Self = StObject.set(x, "arrayMerge", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setCustomMerge(
        value: (/* key */ String, /* options */ js.UndefOr[Options]) => js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
      ): Self = StObject.set(x, "customMerge", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomMergeUndefined: Self = StObject.set(x, "customMerge", js.undefined)
      
      @scala.inline
      def setIsMergeableObject(value: /* value */ js.Object => Boolean): Self = StObject.set(x, "isMergeableObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsMergeableObjectUndefined: Self = StObject.set(x, "isMergeableObject", js.undefined)
    }
  }
}
