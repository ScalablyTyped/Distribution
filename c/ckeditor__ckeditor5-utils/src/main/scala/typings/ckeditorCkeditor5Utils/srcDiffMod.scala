package typings.ckeditorCkeditor5Utils

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDiffMod {
  
  object default {
    
    inline def apply[T](a: ArrayLike[T], b: ArrayLike[T]): js.Array[DiffResult] = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiffResult]]
    inline def apply[T](a: ArrayLike[T], b: ArrayLike[T], cmp: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[DiffResult] = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiffResult]]
    
    @JSImport("@ckeditor/ckeditor5-utils/src/diff", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_fastdiff.default` */
    inline def fastDiff[T, AtomicChanges /* <: Boolean */](a: ArrayLike[T], b: ArrayLike[T]): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fastDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ]]
    inline def fastDiff[T, AtomicChanges /* <: Boolean */](a: ArrayLike[T], b: ArrayLike[T], cmp: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fastDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ]]
    inline def fastDiff[T, AtomicChanges /* <: Boolean */](
      a: ArrayLike[T],
      b: ArrayLike[T],
      cmp: js.Function2[/* a */ T, /* b */ T, Boolean],
      atomicChanges: AtomicChanges
    ): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fastDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], atomicChanges.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ]]
    inline def fastDiff[T, AtomicChanges /* <: Boolean */](a: ArrayLike[T], b: ArrayLike[T], cmp: Unit, atomicChanges: AtomicChanges): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fastDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], atomicChanges.asInstanceOf[js.Any])).asInstanceOf[js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: AtomicChanges extends true ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/diff.DiffResult : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/difftochanges.Change<T> */ js.Any
      ]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete
  */
  trait DiffResult extends StObject
  object DiffResult {
    
    inline def delete: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete = "delete".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete]
    
    inline def equal: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal = "equal".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal]
    
    inline def insert: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert = "insert".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert]
  }
}
