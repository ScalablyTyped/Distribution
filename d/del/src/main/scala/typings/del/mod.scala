package typings.del

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("del", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteAsync(patterns: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def deleteAsync(patterns: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def deleteAsync(patterns: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def deleteAsync(patterns: js.Array[String], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def deleteSync(patterns: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def deleteSync(patterns: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def deleteSync(patterns: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def deleteSync(patterns: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options
    extends StObject
       with typings.globby.mod.Options {
    
    /**
    	See what would be deleted.
    	@default false
    	@example
    	```
    	import {deleteAsync} from 'del';
    	const deletedPaths = await deleteAsync(['temp/ *.js'], {dryRun: true});
    	console.log('Files and directories that would be deleted:\n', deletedPaths.join('\n'));
    	```
    	*/
    val dryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Allow deleting the current working directory and outside.
    	@default false
    	*/
    val force: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Called after each file or directory is deleted.
    	@example
    	```
    	import {deleteAsync} from 'del';
    	await deleteAsync(patterns, {
    		onProgress: progress => {
    		// …
    	}});
    	```
    	*/
    val onProgress: js.UndefOr[js.Function1[/* progress */ ProgressData, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setOnProgress(value: /* progress */ ProgressData => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  trait ProgressData extends StObject {
    
    /**
    	Deleted files and directories count.
    	*/
    val deletedCount: Double
    
    /**
    	Completed percentage. A value between `0` and `1`.
    	*/
    val percent: Double
    
    /**
    	Total files and directories count.
    	*/
    val totalCount: Double
  }
  object ProgressData {
    
    inline def apply(deletedCount: Double, percent: Double, totalCount: Double): ProgressData = {
      val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    extension [Self <: ProgressData](x: Self) {
      
      inline def setDeletedCount(value: Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
}
