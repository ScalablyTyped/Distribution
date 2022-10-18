package typings.bconnorwhiteModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@bconnorwhite/module/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackageJSON(dirname: String): js.Promise[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJSON */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJSON")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJSON */ Any
    ]
  ]]
  
  inline def getPackageJSONSync(dirname: String): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJSON */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJSONSync")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJSON */ Any
  ]]
  
  inline def getVersion(dirname: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getVersionSync(dirname: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionSync")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
