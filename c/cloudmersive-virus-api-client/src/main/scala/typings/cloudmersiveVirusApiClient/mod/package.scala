package typings.cloudmersiveVirusApiClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ScanFile = js.Function2[
    /* inputFile */ typings.node.Buffer, 
    /* callback */ js.Function3[
      /* error */ js.Any, 
      /* data */ typings.cloudmersiveVirusApiClient.mod.VirusScanResult, 
      /* response */ js.Any, 
      js.Any
    ], 
    js.Any
  ]
  
  type ScanFileAdvanced = js.Function3[
    /* inputFile */ typings.node.Buffer, 
    /* opts */ typings.cloudmersiveVirusApiClient.mod.ScanFileAdvancedOptions, 
    /* callback */ js.Function3[
      /* error */ js.Any, 
      /* data */ typings.cloudmersiveVirusApiClient.mod.VirusScanAdvancedResult, 
      /* response */ js.Any, 
      js.Any
    ], 
    js.Any
  ]
  
  type ScanWebsite = js.Function2[
    /* input */ typings.cloudmersiveVirusApiClient.mod.WebsiteScanRequest, 
    /* callback */ js.Function3[
      /* error */ js.Any, 
      /* data */ typings.cloudmersiveVirusApiClient.mod.WebsiteScanResult, 
      /* response */ js.Any, 
      js.Any
    ], 
    js.Any
  ]
}
