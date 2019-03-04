package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Naclarch extends js.Object {
  var nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
    Anon_ARM, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ARM[keyof chrome-apps.Anon_ARM] */ js.Any
    ]
  ]
  var sub_package_path: java.lang.String
}

object Anon_Naclarch {
  @scala.inline
  def apply(
    nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
      Anon_ARM, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ARM[keyof chrome-apps.Anon_ARM] */ js.Any
      ]
    ],
    sub_package_path: java.lang.String
  ): Anon_Naclarch = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path)
  
    __obj.asInstanceOf[Anon_Naclarch]
  }
}

