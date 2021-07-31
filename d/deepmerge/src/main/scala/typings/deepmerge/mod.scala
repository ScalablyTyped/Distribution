package typings.deepmerge

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](x: Partial[T], y: Partial[T]): T = (^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def apply[T](x: Partial[T], y: Partial[T], options: Options): T = (^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("deepmerge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all(objects: js.Array[js.Object]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def all(objects: js.Array[js.Object], options: Options): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(objects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def all_T_T[T](objects: js.Array[Partial[T]]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(objects.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def all_T_T[T](objects: js.Array[Partial[T]], options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(objects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait Options extends StObject {
    
    var arrayMerge: js.UndefOr[
        js.Function3[
          /* target */ js.Array[js.Any], 
          /* source */ js.Array[js.Any], 
          /* options */ js.UndefOr[this.type], 
          js.Array[js.Any]
        ]
      ] = js.undefined
    
    @JSName("clone")
    var clone_FOptions: js.UndefOr[Boolean] = js.undefined
    
    var customMerge: js.UndefOr[
        js.Function2[
          /* key */ String, 
          /* options */ js.UndefOr[this.type], 
          js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]]
        ]
      ] = js.undefined
    
    var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, Boolean]] = js.undefined
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
        value: (/* target */ js.Array[js.Any], /* source */ js.Array[js.Any], /* options */ js.UndefOr[Options]) => js.Array[js.Any]
      ): Self = StObject.set(x, "arrayMerge", js.Any.fromFunction3(value))
      
      @scala.inline
      def setArrayMergeUndefined: Self = StObject.set(x, "arrayMerge", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setCustomMerge(
        value: (/* key */ String, /* options */ js.UndefOr[Options]) => js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]]
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
